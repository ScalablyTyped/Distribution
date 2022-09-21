package typings.htmlValidator.mod

import typings.htmlValidator.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(options: OptionsForExternalUrlAsValidationTargetAndObjectAsResult): js.Promise[ParsedJsonAsValidationResults] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedJsonAsValidationResults]]
inline def apply(options: OptionsForExternalUrlAsValidationTargetAndTextAsResults): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def apply(options: OptionsForHtmlFileAsValidationTargetAndObjectAsResult): js.Promise[ParsedJsonAsValidationResults] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedJsonAsValidationResults]]
inline def apply(options: OptionsForHtmlFileAsValidationTargetAndTextAsResults): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]

type ValidationMessageLocationObject = ValidationMessageSimpleObject & ValidationMessageBasicLocationObject

type ValidationMessageObject = ValidationMessageSimpleObject | ValidationMessageLocationObject

type ValidationMessageSimpleObject = (ValidationMessageBasicErrorObject & ValidationMessageBasicObject) | (ValidationMessageBasicInfoObject & ValidationMessageBasicObject) | (ValidationMessageBasicNonDocumentErrorObject & ValidationMessageBasicObject)
