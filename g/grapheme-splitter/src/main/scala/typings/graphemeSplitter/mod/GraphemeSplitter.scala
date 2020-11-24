package typings.graphemeSplitter.mod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphemeSplitter extends js.Object {
  
  /** count the number of grapheme clusters in a string */
  def countGraphemes(s: String): Double = js.native
  
  /** iterate the string to an iterable iterator of grapheme clusters */
  def iterateGraphemes(s: String): IterableIterator[String] = js.native
  
  /** split the string to an array of grapheme clusters */
  def splitGraphemes(s: String): js.Array[String] = js.native
}
object GraphemeSplitter {
  
  @scala.inline
  def apply(
    countGraphemes: String => Double,
    iterateGraphemes: String => IterableIterator[String],
    splitGraphemes: String => js.Array[String]
  ): GraphemeSplitter = {
    val __obj = js.Dynamic.literal(countGraphemes = js.Any.fromFunction1(countGraphemes), iterateGraphemes = js.Any.fromFunction1(iterateGraphemes), splitGraphemes = js.Any.fromFunction1(splitGraphemes))
    __obj.asInstanceOf[GraphemeSplitter]
  }
  
  @scala.inline
  implicit class GraphemeSplitterOps[Self <: GraphemeSplitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCountGraphemes(value: String => Double): Self = this.set("countGraphemes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIterateGraphemes(value: String => IterableIterator[String]): Self = this.set("iterateGraphemes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSplitGraphemes(value: String => js.Array[String]): Self = this.set("splitGraphemes", js.Any.fromFunction1(value))
  }
}
