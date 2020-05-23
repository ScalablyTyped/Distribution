package typings.ionic

import typings.ionic.ailmentsBaseMod.AilmentDeps
import typings.ionic.definitionsMod.IAilment
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
    extends typings.ionic.ailmentsBaseMod.Ailment
  
  @js.native
  class DefaultCordovaBundleIdUsed ()
    extends typings.ionic.ailmentsBaseMod.Ailment
  
  @js.native
  class GitConfigInvalid ()
    extends typings.ionic.ailmentsBaseMod.Ailment
  
  @js.native
  class GitNotUsed ()
    extends typings.ionic.ailmentsBaseMod.Ailment
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ionic.definitionsMod.IAilment because Already inherited
  - typings.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @js.native
  class IonicCLIInstalledLocally ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    val treatable: /* true */ Boolean = js.native
  }
  
  @js.native
  class IonicNativeOldVersionInstalled ()
    extends typings.ionic.ailmentsBaseMod.Ailment
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ionic.definitionsMod.IAilment because Already inherited
  - typings.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @js.native
  class NpmInstalledLocally ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    val treatable: /* true */ Boolean = js.native
  }
  
  @js.native
  class UnsavedCordovaPlatforms ()
    extends typings.ionic.ailmentsBaseMod.Ailment
  
  @js.native
  class ViewportFitNotSet ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_ViewportFitNotSet: `viewport-fit-not-set` = js.native
  }
  
  def formatAilmentMessage(ailment: IAilment): js.Promise[String] = js.native
}

