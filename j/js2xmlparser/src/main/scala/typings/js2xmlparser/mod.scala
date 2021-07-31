package typings.js2xmlparser

import typings.js2xmlparser.optionsMod.IOptions
import typings.xmlcreate.mod.XmlElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js2xmlparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def parse(root: String, `object`: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(root.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def parse(root: String, `object`: js.Any, options: IOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(root.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def parseToExistingElement(element: XmlElement[js.Any], `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToExistingElement")(element.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def parseToExistingElement(element: XmlElement[js.Any], `object`: js.Any, options: IOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseToExistingElement")(element.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
