package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visionV1 {
  
  @JSImport("googleapis", "vision_v1.Resource$Files")
  @js.native
  class ResourceFiles protected ()
    extends typings.googleapis.visionV1Mod.visionV1.ResourceFiles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vision_v1.Resource$Images")
  @js.native
  class ResourceImages protected ()
    extends typings.googleapis.visionV1Mod.visionV1.ResourceImages {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vision_v1.Resource$Locations")
  @js.native
  class ResourceLocations protected ()
    extends typings.googleapis.visionV1Mod.visionV1.ResourceLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vision_v1.Resource$Locations$Operations")
  @js.native
  class ResourceLocationsOperations protected ()
    extends typings.googleapis.visionV1Mod.visionV1.ResourceLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vision_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.visionV1Mod.visionV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vision_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.visionV1Mod.visionV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vision_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.visionV1Mod.visionV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vision_v1.Resource$Projects$Locations$Products")
  @js.native
  class ResourceProjectsLocationsProducts protected ()
    extends typings.googleapis.visionV1Mod.visionV1.ResourceProjectsLocationsProducts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vision_v1.Resource$Projects$Locations$Products$Referenceimages")
  @js.native
  class ResourceProjectsLocationsProductsReferenceimages protected ()
    extends typings.googleapis.visionV1Mod.visionV1.ResourceProjectsLocationsProductsReferenceimages {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vision_v1.Resource$Projects$Locations$Productsets")
  @js.native
  class ResourceProjectsLocationsProductsets protected ()
    extends typings.googleapis.visionV1Mod.visionV1.ResourceProjectsLocationsProductsets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vision_v1.Resource$Projects$Locations$Productsets$Products")
  @js.native
  class ResourceProjectsLocationsProductsetsProducts protected ()
    extends typings.googleapis.visionV1Mod.visionV1.ResourceProjectsLocationsProductsetsProducts {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Vision API
    *
    * Integrates Google Vision features, including image labeling, face, logo,
    * and landmark detection, optical character recognition (OCR), and detection
    * of explicit content, into applications.
    *
    * @example
    * const {google} = require('googleapis');
    * const vision = google.vision('v1');
    *
    * @namespace vision
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Vision
    */
  @JSImport("googleapis", "vision_v1.Vision")
  @js.native
  class Vision protected ()
    extends typings.googleapis.visionV1Mod.visionV1.Vision {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
