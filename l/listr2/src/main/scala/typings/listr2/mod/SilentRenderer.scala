package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable2
import typings.listr2.anon.TypeofSilentRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SilentRenderer extends ListrRenderer {
  
  var options: /* import warning: importer.ImportType#apply Failed type conversion: listr2.anon.TypeofSilentRenderer & new (tasks : std.Array<listr2.listr2.Task<any, typeof SilentRenderer>>, options : typeof SilentRenderer['rendererOptions']): listr2.listr2.SilentRenderer['rendererOptions'] */ js.Any = js.native
  
  var tasks: js.Array[
    Task[
      Any, 
      TypeofSilentRenderer & (Instantiable2[
        /* tasks */ js.Array[
          Task[
            Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SilentRenderer */ js.Any
          ]
        ], 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SilentRenderer['rendererOptions'] */ /* options */ js.Any, 
        SilentRenderer
      ])
    ]
  ] = js.native
}
