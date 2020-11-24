package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlWriter extends js.Object {
  
  /**
    * closes all open tags and ends the document
    */
  def closeAll(): Unit = js.native
  
  /**
    * closes an open XML tag.
    */
  def closeTag(name: String): Unit = js.native
  
  def indent(str: String): String = js.native
  
  /**
    * writes a tag and its value opening and closing it at the same time
    */
  def inlineTag(name: String): Unit = js.native
  def inlineTag(name: String, attrs: js.UndefOr[scala.Nothing], content: String): Unit = js.native
  def inlineTag(name: String, attrs: js.Any): Unit = js.native
  def inlineTag(name: String, attrs: js.Any, content: String): Unit = js.native
  
  /**
    * writes the opening XML tag with the supplied attributes
    */
  def openTag(name: String): Unit = js.native
  def openTag(name: String, attrs: js.Any): Unit = js.native
}
