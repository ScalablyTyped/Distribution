package typings.intlTelInput.mod

import typings.intlTelInput.mod.^
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * initialise the plugin with optional options.
  * @param options options that can be provided during initialization.
  */
inline def apply(node: Element): Plugin = ^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any]).asInstanceOf[Plugin]
inline def apply(node: Element, options: Options): Plugin = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Plugin]

// TODO: remove alias at v18
type Static = IntlTelInputGlobals
