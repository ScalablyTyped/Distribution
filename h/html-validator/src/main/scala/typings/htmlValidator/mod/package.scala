package typings.htmlValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ValidationMessageLocationObject = typings.htmlValidator.mod.ValidationMessageSimpleObject with typings.htmlValidator.mod.ValidationMessageBasicLocationObject
  
  type ValidationMessageObject = typings.htmlValidator.mod.ValidationMessageSimpleObject | typings.htmlValidator.mod.ValidationMessageLocationObject
  
  type ValidationMessageSimpleObject = (typings.htmlValidator.mod.ValidationMessageBasicErrorObject | typings.htmlValidator.mod.ValidationMessageBasicInfoObject | typings.htmlValidator.mod.ValidationMessageBasicNonDocumentErrorObject) with typings.htmlValidator.mod.ValidationMessageBasicObject
}
