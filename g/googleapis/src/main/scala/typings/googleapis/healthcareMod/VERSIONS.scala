package typings.googleapis.healthcareMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.healthcareV1Mod.healthcareV1.Healthcare
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/healthcare", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/healthcare", "VERSIONS.v1")
  @js.native
  open class v1 protected () extends Healthcare {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/healthcare", "VERSIONS.v1")
  @js.native
  def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Healthcare] = js.native
  inline def v1_=(
    x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Healthcare]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/healthcare", "VERSIONS.v1beta1")
  @js.native
  open class v1beta1 protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/healthcare", "VERSIONS.v1beta1")
  @js.native
  def v1beta1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare
  ] = js.native
  inline def v1beta1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
}
