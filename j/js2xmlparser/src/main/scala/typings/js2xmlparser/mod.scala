package typings.js2xmlparser

import typings.js2xmlparser.optionsMod.IOptions
import typings.xmlcreate.mod.XmlElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js2xmlparser", "Absent")
  @js.native
  class Absent protected () extends StObject
  /* static members */
  object Absent {
    
    @JSImport("js2xmlparser", "Absent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("js2xmlparser", "Absent._instance")
    @js.native
    def _instance: js.Any = js.native
    @scala.inline
    def _instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("js2xmlparser", "parse")
  @js.native
  def parse(root: String, `object`: js.Any): String = js.native
  @JSImport("js2xmlparser", "parse")
  @js.native
  def parse(root: String, `object`: js.Any, options: IOptions): String = js.native
  
  @JSImport("js2xmlparser", "parseToExistingElement")
  @js.native
  def parseToExistingElement(element: XmlElement[_], `object`: js.Any): Unit = js.native
  @JSImport("js2xmlparser", "parseToExistingElement")
  @js.native
  def parseToExistingElement(element: XmlElement[_], `object`: js.Any, options: IOptions): Unit = js.native
}
