package typings.googleapis.tagmanagerMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.tagmanagerV1Mod.tagmanagerV1.Tagmanager
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/tagmanager", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/tagmanager", "VERSIONS.v1")
  @js.native
  open class v1 protected () extends Tagmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/tagmanager", "VERSIONS.v1")
  @js.native
  def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Tagmanager] = js.native
  inline def v1_=(
    x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Tagmanager]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/tagmanager", "VERSIONS.v2")
  @js.native
  open class v2 protected ()
    extends typings.googleapis.tagmanagerV2Mod.tagmanagerV2.Tagmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/tagmanager", "VERSIONS.v2")
  @js.native
  def v2: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.tagmanagerV2Mod.tagmanagerV2.Tagmanager
  ] = js.native
  inline def v2_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.tagmanagerV2Mod.tagmanagerV2.Tagmanager
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
}
