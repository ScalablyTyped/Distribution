package typings.jointjs.mod.shapes.devs

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.dia.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "shapes.devs.Model")
@js.native
class Model () extends Element {
  def this(attributes: ModelAttributes) = this()
  def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
  def this(attributes: ModelAttributes, opt: StringDictionary[js.Any]) = this()
  
  def addInPort(port: String): this.type = js.native
  def addInPort(port: String, opt: js.Any): this.type = js.native
  
  def addOutPort(port: String): this.type = js.native
  def addOutPort(port: String, opt: js.Any): this.type = js.native
  
  def changeInGroup(properties: js.Any): Boolean = js.native
  def changeInGroup(properties: js.Any, opt: js.Any): Boolean = js.native
  
  def changeOutGroup(properties: js.Any): Boolean = js.native
  def changeOutGroup(properties: js.Any, opt: js.Any): Boolean = js.native
  
  def createPortItem(group: String, port: String): js.Any = js.native
  
  def createPortItems(group: String, ports: js.Array[String]): js.Array[_] = js.native
  
  def removeInPort(port: String): this.type = js.native
  def removeInPort(port: String, opt: js.Any): this.type = js.native
  
  def removeOutPort(port: String): this.type = js.native
  def removeOutPort(port: String, opt: js.Any): this.type = js.native
}
