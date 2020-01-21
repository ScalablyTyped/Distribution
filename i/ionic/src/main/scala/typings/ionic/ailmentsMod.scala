package typings.ionic

import typings.ionic.ailmentsBaseMod.AilmentDeps
import typings.ionic.definitionsMod.IAilment
import typings.ionic.ionicBooleans.`true`
import typings.ionic.ionicStrings.`cordova-platforms-committed`
import typings.ionic.ionicStrings.`default-cordova-bundle-id-used`
import typings.ionic.ionicStrings.`git-config-invalid`
import typings.ionic.ionicStrings.`git-not-used`
import typings.ionic.ionicStrings.`ionic-installed-locally`
import typings.ionic.ionicStrings.`ionic-native-old-version-installed`
import typings.ionic.ionicStrings.`npm-installed-locally`
import typings.ionic.ionicStrings.`unsaved-cordova-platforms`
import typings.ionic.ionicStrings.`viewport-fit-not-set`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/doctor/ailments", JSImport.Namespace)
@js.native
object ailmentsMod extends js.Object {
  @js.native
  abstract class Ailment protected ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @js.native
  class AilmentRegistry ()
    extends typings.ionic.ailmentsBaseMod.AilmentRegistry
  
  @js.native
  class CordovaPlatformsCommitted ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_CordovaPlatformsCommitted: `cordova-platforms-committed` = js.native
  }
  
  @js.native
  class DefaultCordovaBundleIdUsed ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_DefaultCordovaBundleIdUsed: `default-cordova-bundle-id-used` = js.native
  }
  
  @js.native
  class GitConfigInvalid ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_GitConfigInvalid: `git-config-invalid` = js.native
  }
  
  @js.native
  class GitNotUsed ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_GitNotUsed: `git-not-used` = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.ionic.definitionsMod.IAilment because Already inherited
  - typings.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @js.native
  class IonicCLIInstalledLocally ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_IonicCLIInstalledLocally: `ionic-installed-locally` = js.native
    val treatable: Boolean | `true` = js.native
  }
  
  @js.native
  class IonicNativeOldVersionInstalled ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_IonicNativeOldVersionInstalled: `ionic-native-old-version-installed` = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.ionic.definitionsMod.IAilment because Already inherited
  - typings.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @js.native
  class NpmInstalledLocally ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_NpmInstalledLocally: `npm-installed-locally` = js.native
    val treatable: Boolean | `true` = js.native
  }
  
  @js.native
  class UnsavedCordovaPlatforms ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_UnsavedCordovaPlatforms: `unsaved-cordova-platforms` = js.native
  }
  
  @js.native
  class ViewportFitNotSet ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_ViewportFitNotSet: `viewport-fit-not-set` = js.native
  }
  
  def formatAilmentMessage(ailment: IAilment): js.Promise[String] = js.native
}

