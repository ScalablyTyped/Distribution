package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def apply(options: typings.htmlValidator.mod.OptionsForExternalUrlAsValidationTargetAndObjectAsResult): js.Promise[typings.htmlValidator.mod.ParsedJsonAsValidationResults] = typings.htmlValidator.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.htmlValidator.mod.ParsedJsonAsValidationResults]]
@scala.inline
def apply(options: typings.htmlValidator.mod.OptionsForExternalUrlAsValidationTargetAndTextAsResults): js.Promise[java.lang.String] = typings.htmlValidator.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
@scala.inline
def apply(options: typings.htmlValidator.mod.OptionsForHtmlFileAsValidationTargetAndObjectAsResult): js.Promise[typings.htmlValidator.mod.ParsedJsonAsValidationResults] = typings.htmlValidator.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.htmlValidator.mod.ParsedJsonAsValidationResults]]
@scala.inline
def apply(options: typings.htmlValidator.mod.OptionsForHtmlFileAsValidationTargetAndTextAsResults): js.Promise[java.lang.String] = typings.htmlValidator.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]

type ValidationMessageLocationObject = typings.htmlValidator.mod.ValidationMessageSimpleObject & typings.htmlValidator.mod.ValidationMessageBasicLocationObject

type ValidationMessageObject = typings.htmlValidator.mod.ValidationMessageSimpleObject | typings.htmlValidator.mod.ValidationMessageLocationObject

type ValidationMessageSimpleObject = (typings.htmlValidator.mod.ValidationMessageBasicErrorObject | typings.htmlValidator.mod.ValidationMessageBasicInfoObject | typings.htmlValidator.mod.ValidationMessageBasicNonDocumentErrorObject) & typings.htmlValidator.mod.ValidationMessageBasicObject
