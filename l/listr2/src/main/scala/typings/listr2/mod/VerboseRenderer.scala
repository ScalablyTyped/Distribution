package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable2
import typings.listr2.anon.TypeofVerboseRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerboseRenderer extends ListrRenderer {
  
  /* private */ var logger: Any = js.native
  
  var options: /* import warning: importer.ImportType#apply Failed type conversion: listr2.anon.TypeofVerboseRenderer & new (tasks : std.Array<listr2.listr2.Task<any, typeof VerboseRenderer>>, options : typeof VerboseRenderer['rendererOptions']): listr2.listr2.VerboseRenderer['rendererOptions'] */ js.Any = js.native
  
  var tasks: js.Array[
    Task[
      Any, 
      TypeofVerboseRenderer & (Instantiable2[
        /* tasks */ js.Array[
          Task[
            Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof VerboseRenderer */ js.Any
          ]
        ], 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof VerboseRenderer['rendererOptions'] */ /* options */ js.Any, 
        VerboseRenderer
      ])
    ]
  ] = js.native
  
  /* private */ var verboseRenderer: Any = js.native
}
