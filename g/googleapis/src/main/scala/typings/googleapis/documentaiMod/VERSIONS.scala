package typings.googleapis.documentaiMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.documentaiV1Mod.documentaiV1.Documentai
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/documentai", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/documentai", "VERSIONS.v1")
  @js.native
  open class v1 protected () extends Documentai {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/documentai", "VERSIONS.v1")
  @js.native
  def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Documentai] = js.native
  inline def v1_=(
    x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Documentai]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/documentai", "VERSIONS.v1beta2")
  @js.native
  open class v1beta2 protected ()
    extends typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2.Documentai {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/documentai", "VERSIONS.v1beta2")
  @js.native
  def v1beta2: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2.Documentai
  ] = js.native
  inline def v1beta2_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2.Documentai
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta2")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/documentai", "VERSIONS.v1beta3")
  @js.native
  open class v1beta3 protected ()
    extends typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3.Documentai {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/documentai", "VERSIONS.v1beta3")
  @js.native
  def v1beta3: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3.Documentai
  ] = js.native
  inline def v1beta3_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3.Documentai
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta3")(x.asInstanceOf[js.Any])
}
