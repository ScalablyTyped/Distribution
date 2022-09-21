package typings.googleapis.retailMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.retailV2Mod.retailV2.Retail
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/retail", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/retail", "VERSIONS.v2")
  @js.native
  open class v2 protected () extends Retail {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/retail", "VERSIONS.v2")
  @js.native
  def v2: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Retail] = js.native
  inline def v2_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Retail]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/retail", "VERSIONS.v2alpha")
  @js.native
  open class v2alpha protected ()
    extends typings.googleapis.retailV2alphaMod.retailV2alpha.Retail {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/retail", "VERSIONS.v2alpha")
  @js.native
  def v2alpha: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.retailV2alphaMod.retailV2alpha.Retail
  ] = js.native
  inline def v2alpha_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.retailV2alphaMod.retailV2alpha.Retail
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2alpha")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/retail", "VERSIONS.v2beta")
  @js.native
  open class v2beta protected ()
    extends typings.googleapis.retailV2betaMod.retailV2beta.Retail {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/retail", "VERSIONS.v2beta")
  @js.native
  def v2beta: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.retailV2betaMod.retailV2beta.Retail
  ] = js.native
  inline def v2beta_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.retailV2betaMod.retailV2beta.Retail
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2beta")(x.asInstanceOf[js.Any])
}
