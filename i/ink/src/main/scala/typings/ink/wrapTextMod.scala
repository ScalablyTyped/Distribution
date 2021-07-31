package typings.ink

import typings.ink.inkStrings.`truncate-end`
import typings.ink.inkStrings.`truncate-middle`
import typings.ink.inkStrings.`truncate-start`
import typings.ink.inkStrings.end
import typings.ink.inkStrings.middle
import typings.ink.inkStrings.truncate
import typings.ink.inkStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapTextMod {
  
  @JSImport("ink/build/wrap-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(text: String, maxWidth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def default_end(text: String, maxWidth: Double, wrapType: end): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], wrapType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def default_middle(text: String, maxWidth: Double, wrapType: middle): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], wrapType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def default_truncate(text: String, maxWidth: Double, wrapType: truncate): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], wrapType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def default_truncateend(text: String, maxWidth: Double, wrapType: `truncate-end`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], wrapType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def default_truncatemiddle(text: String, maxWidth: Double, wrapType: `truncate-middle`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], wrapType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def default_truncatestart(text: String, maxWidth: Double, wrapType: `truncate-start`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], wrapType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def default_wrap(text: String, maxWidth: Double, wrapType: wrap): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], wrapType.asInstanceOf[js.Any])).asInstanceOf[String]
}
