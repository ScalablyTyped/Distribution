package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable2
import typings.listr2.anon.TypeofTestRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type ListrTestRendererTask = listr2.listr2.Task<any, {  nonTTY :boolean,   rendererOptions :listr2.listr2.ListrTestRendererOptions,   rendererTaskOptions :listr2.listr2.ListrTestRendererTaskOptions} & new (tasks : std.Array<listr2.listr2.ListrTestRendererTask>, options : listr2.listr2.ListrTestRendererOptions): listr2.listr2.TestRenderer>
}}}
to avoid circular code involving: 
- listr2.listr2.ListrTestRenderer
- listr2.listr2.ListrTestRendererTask
*/
@js.native
trait ListrTestRendererTask
  extends Task[
      Any, 
      TypeofTestRenderer & (Instantiable2[
        /* tasks */ js.Array[ListrTestRendererTask], 
        /* options */ ListrTestRendererOptions, 
        TestRenderer
      ])
    ]
