package typings.jpm

import typings.jpm.jpmStrings.html
import typings.jpm.jpmStrings.image
import typings.jpm.jpmStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardMod {
  
  @JSImport("sdk/clipboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def get(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[String]
  
  @scala.inline
  def get_html(datatype: html): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(datatype.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def get_image(datatype: image): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(datatype.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def get_text(datatype: text): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(datatype.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def set(data: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def set_html(data: String, datatype: html): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(data.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def set_image(data: String, datatype: image): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(data.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def set_text(data: String, datatype: text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(data.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
