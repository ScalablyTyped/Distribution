package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable2
import typings.listr2.anon.TypeofListrBaseRenderer
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exported for javascript applications to extend the base renderer */
@js.native
trait ListrBaseRenderer
  extends StObject
     with ListrRenderer {
  
  var options: Record[PropertyKey, Any] = js.native
  
  var tasks: js.Array[
    Task[
      Any, 
      TypeofListrBaseRenderer & (Instantiable2[
        /* tasks */ js.Array[
          Task[
            Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ListrBaseRenderer */ js.Any
          ]
        ], 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ListrBaseRenderer.rendererOptions */ /* options */ js.Any, 
        ListrBaseRenderer
      ])
    ]
  ] = js.native
}
