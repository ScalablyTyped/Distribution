package typings.juiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilKeyParser extends js.Object {
  
  def changeIndex(index: String, targetIndex: String, rootIndex: String): String = js.native
  
  def getIndexList(index: String): Boolean = js.native
  
  def getNextIndex(index: String): String = js.native
  
  def getParentIndex(index: String): String = js.native
  
  def isIndexDepth(index: String): Boolean = js.native
}
object UtilKeyParser {
  
  @scala.inline
  def apply(
    changeIndex: (String, String, String) => String,
    getIndexList: String => Boolean,
    getNextIndex: String => String,
    getParentIndex: String => String,
    isIndexDepth: String => Boolean
  ): UtilKeyParser = {
    val __obj = js.Dynamic.literal(changeIndex = js.Any.fromFunction3(changeIndex), getIndexList = js.Any.fromFunction1(getIndexList), getNextIndex = js.Any.fromFunction1(getNextIndex), getParentIndex = js.Any.fromFunction1(getParentIndex), isIndexDepth = js.Any.fromFunction1(isIndexDepth))
    __obj.asInstanceOf[UtilKeyParser]
  }
  
  @scala.inline
  implicit class UtilKeyParserOps[Self <: UtilKeyParser] (val x: Self) extends AnyVal {
    
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
    def setChangeIndex(value: (String, String, String) => String): Self = this.set("changeIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetIndexList(value: String => Boolean): Self = this.set("getIndexList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNextIndex(value: String => String): Self = this.set("getNextIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParentIndex(value: String => String): Self = this.set("getParentIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsIndexDepth(value: String => Boolean): Self = this.set("isIndexDepth", js.Any.fromFunction1(value))
  }
}
