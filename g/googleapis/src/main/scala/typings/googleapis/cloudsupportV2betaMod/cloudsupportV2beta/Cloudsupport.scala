package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsupport/v2beta", "cloudsupport_v2beta.Cloudsupport")
@js.native
open class Cloudsupport protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var attachments: ResourceAttachments = js.native
  
  var caseClassifications: ResourceCaseclassifications = js.native
  
  var cases: ResourceCases = js.native
  
  var context: APIRequestContext = js.native
  
  var media: ResourceMedia = js.native
}
