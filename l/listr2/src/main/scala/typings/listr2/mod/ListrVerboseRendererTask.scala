package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable2
import typings.listr2.anon.TypeofVerboseRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type ListrVerboseRendererTask = listr2.listr2.Task<any, {  nonTTY :boolean,   rendererOptions :listr2.listr2.ListrVerboseRendererOptions,   rendererTaskOptions :listr2.listr2.ListrVerboseRendererTaskOptions} & new (tasks : std.Array<listr2.listr2.ListrVerboseRendererTask>, options : listr2.listr2.ListrVerboseRendererOptions): listr2.listr2.VerboseRenderer>
}}}
to avoid circular code involving: 
- listr2.listr2.ListrVerboseRenderer
- listr2.listr2.ListrVerboseRendererTask
*/
@js.native
trait ListrVerboseRendererTask
  extends Task[
      Any, 
      TypeofVerboseRenderer & (Instantiable2[
        /* tasks */ js.Array[ListrVerboseRendererTask], 
        /* options */ ListrVerboseRendererOptions, 
        VerboseRenderer
      ])
    ]
