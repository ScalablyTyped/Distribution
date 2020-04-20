package typings.js2xmlparser

import typings.js2xmlparser.optionsMod.IOptions
import typings.xmlcreate.mod.XmlElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js2xmlparser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Absent protected () extends js.Object
  
  def parse(root: String, `object`: js.Any): String = js.native
  def parse(root: String, `object`: js.Any, options: IOptions): String = js.native
  def parseToExistingElement(element: XmlElement[_], `object`: js.Any): Unit = js.native
  def parseToExistingElement(element: XmlElement[_], `object`: js.Any, options: IOptions): Unit = js.native
  /* static members */
  @js.native
  object Absent extends js.Object {
    var _instance: js.Any = js.native
    /**
      * Returns the sole instance of Absent.
      */
    def instance: Absent = js.native
  }
  
}

