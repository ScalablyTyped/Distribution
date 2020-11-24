package typings.lineNavigator.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineNavigator extends js.Object {
  
  def find(regex: RegExp, indexToStartWith: Double, callback: FindCallback): Unit = js.native
  
  def findAll(regex: RegExp, indexToStartWith: Double, limit: Double, callback: FindAllCallback): Unit = js.native
  
  def readLines(indexToStartWith: Double, numberOfLines: Double, callback: ReadLinesCallback): Unit = js.native
  
  def readSomeLines(indexToStartWith: Double, callback: ReadLinesCallback): Unit = js.native
}
object LineNavigator {
  
  @scala.inline
  def apply(
    find: (RegExp, Double, FindCallback) => Unit,
    findAll: (RegExp, Double, Double, FindAllCallback) => Unit,
    readLines: (Double, Double, ReadLinesCallback) => Unit,
    readSomeLines: (Double, ReadLinesCallback) => Unit
  ): LineNavigator = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction3(find), findAll = js.Any.fromFunction4(findAll), readLines = js.Any.fromFunction3(readLines), readSomeLines = js.Any.fromFunction2(readSomeLines))
    __obj.asInstanceOf[LineNavigator]
  }
  
  @scala.inline
  implicit class LineNavigatorOps[Self <: LineNavigator] (val x: Self) extends AnyVal {
    
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
    def setFind(value: (RegExp, Double, FindCallback) => Unit): Self = this.set("find", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindAll(value: (RegExp, Double, Double, FindAllCallback) => Unit): Self = this.set("findAll", js.Any.fromFunction4(value))
    
    @scala.inline
    def setReadLines(value: (Double, Double, ReadLinesCallback) => Unit): Self = this.set("readLines", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReadSomeLines(value: (Double, ReadLinesCallback) => Unit): Self = this.set("readSomeLines", js.Any.fromFunction2(value))
  }
}
