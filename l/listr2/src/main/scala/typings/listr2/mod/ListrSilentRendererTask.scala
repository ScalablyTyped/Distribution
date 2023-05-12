package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable2
import typings.listr2.anon.TypeofSilentRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type ListrSilentRendererTask = listr2.listr2.Task<any, {  nonTTY :boolean,   rendererOptions :listr2.listr2.ListrSilentRendererOptions,   rendererTaskOptions :listr2.listr2.ListrSilentRendererTaskOptions} & new (tasks : std.Array<listr2.listr2.ListrSilentRendererTask>, options : listr2.listr2.ListrSilentRendererOptions): listr2.listr2.SilentRenderer>
}}}
to avoid circular code involving: 
- listr2.listr2.ListrSilentRenderer
- listr2.listr2.ListrSilentRendererTask
*/
@js.native
trait ListrSilentRendererTask
  extends Task[
      Any, 
      TypeofSilentRenderer & (Instantiable2[
        /* tasks */ js.Array[ListrSilentRendererTask], 
        /* options */ ListrSilentRendererOptions, 
        SilentRenderer
      ])
    ]
