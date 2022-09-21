package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/streetviewpublish/v1", "streetviewpublish_v1.Streetviewpublish")
@js.native
open class Streetviewpublish protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var photo: ResourcePhoto = js.native
  
  var photoSequence: ResourcePhotosequence = js.native
  
  var photoSequences: ResourcePhotosequences = js.native
  
  var photos: ResourcePhotos = js.native
}
