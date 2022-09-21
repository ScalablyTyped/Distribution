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
    /* getSourceKey */ js.Function1[/* source */ Any, String | Double], 
    /* createResult */ js.Function2[/* source */ Any, /* index */ Double, Any], 
    /* updateResult */ js.Function3[/* source */ Any, /* target */ Any, /* index */ Double, Unit], 
    Mapping[Any, Any]
  ] = js.native
  inline def createMapping_=(
    x: js.Function3[
      /* getSourceKey */ js.Function1[/* source */ Any, String | Double], 
      /* createResult */ js.Function2[/* source */ Any, /* index */ Double, Any], 
      /* updateResult */ js.Function3[/* source */ Any, /* target */ Any, /* index */ Double, Unit], 
      Mapping[Any, Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createMapping")(x.asInstanceOf[js.Any])
}
