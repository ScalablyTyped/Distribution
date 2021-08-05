package typings.maquette

import typings.maquette.interfacesMod.Mapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mappingMod {
  
  @JSImport("maquette/dist/mapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maquette/dist/mapping", "createMapping")
  @js.native
  def createMapping: js.Function3[
    /* getSourceKey */ js.Function1[/* source */ js.Any, String | Double], 
    /* createResult */ js.Function2[/* source */ js.Any, /* index */ Double, js.Any], 
    /* updateResult */ js.Function3[/* source */ js.Any, /* target */ js.Any, /* index */ Double, Unit], 
    Mapping[js.Any, js.Any]
  ] = js.native
  inline def createMapping_=(
    x: js.Function3[
      /* getSourceKey */ js.Function1[/* source */ js.Any, String | Double], 
      /* createResult */ js.Function2[/* source */ js.Any, /* index */ Double, js.Any], 
      /* updateResult */ js.Function3[/* source */ js.Any, /* target */ js.Any, /* index */ Double, Unit], 
      Mapping[js.Any, js.Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createMapping")(x.asInstanceOf[js.Any])
}
