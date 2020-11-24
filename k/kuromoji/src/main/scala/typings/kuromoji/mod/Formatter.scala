package typings.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatter[T] extends js.Object {
  
  def formatEntry(word_id: Double, position: Double, `type`: String, features: js.Array[String]): T = js.native
  
  def formatUnknownEntry(word_id: Double, position: Double, `type`: String, features: js.Array[String]): T = js.native
}
object Formatter {
  
  @scala.inline
  def apply[T](
    formatEntry: (Double, Double, String, js.Array[String]) => T,
    formatUnknownEntry: (Double, Double, String, js.Array[String]) => T
  ): Formatter[T] = {
    val __obj = js.Dynamic.literal(formatEntry = js.Any.fromFunction4(formatEntry), formatUnknownEntry = js.Any.fromFunction4(formatUnknownEntry))
    __obj.asInstanceOf[Formatter[T]]
  }
  
  @scala.inline
  implicit class FormatterOps[Self <: Formatter[_], T] (val x: Self with Formatter[T]) extends AnyVal {
    
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
    def setFormatEntry(value: (Double, Double, String, js.Array[String]) => T): Self = this.set("formatEntry", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFormatUnknownEntry(value: (Double, Double, String, js.Array[String]) => T): Self = this.set("formatUnknownEntry", js.Any.fromFunction4(value))
  }
}
