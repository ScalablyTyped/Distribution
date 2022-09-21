package typings.googleapis.managedidentitiesMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.managedidentitiesV1Mod.managedidentitiesV1.Managedidentities
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/managedidentities", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/managedidentities", "VERSIONS.v1")
  @js.native
  open class v1 protected () extends Managedidentities {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/managedidentities", "VERSIONS.v1")
  @js.native
  def v1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    Managedidentities
  ] = js.native
  inline def v1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      Managedidentities
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/managedidentities", "VERSIONS.v1alpha1")
  @js.native
  open class v1alpha1 protected ()
    extends typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1.Managedidentities {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/managedidentities", "VERSIONS.v1alpha1")
  @js.native
  def v1alpha1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1.Managedidentities
  ] = js.native
  inline def v1alpha1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1.Managedidentities
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/managedidentities", "VERSIONS.v1beta1")
  @js.native
  open class v1beta1 protected ()
    extends typings.googleapis.managedidentitiesV1beta1Mod.managedidentitiesV1beta1.Managedidentities {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/managedidentities", "VERSIONS.v1beta1")
  @js.native
  def v1beta1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.managedidentitiesV1beta1Mod.managedidentitiesV1beta1.Managedidentities
  ] = js.native
  inline def v1beta1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.managedidentitiesV1beta1Mod.managedidentitiesV1beta1.Managedidentities
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
}
