package typings.jss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jss", "SheetsManager")
@js.native
open class SheetsManager () extends StObject {
  
  def add(key: js.Object, sheet: StyleSheet[String | Double | js.Symbol]): Unit = js.native
  
  def get(key: js.Object): (StyleSheet[String | Double | js.Symbol]) | Null = js.native
  
  def manage(key: js.Object): (StyleSheet[String | Double | js.Symbol]) | Null = js.native
  
  val size: Double = js.native
  
  def unmanage(key: js.Object): Unit = js.native
}
