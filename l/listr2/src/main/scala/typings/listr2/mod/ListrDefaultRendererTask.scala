package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable3
import typings.listr2.anon.TypeofDefaultRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type ListrDefaultRendererTask = listr2.listr2.Task<any, {  nonTTY :boolean,   rendererOptions :listr2.listr2.ListrDefaultRendererOptions,   rendererTaskOptions :listr2.listr2.ListrDefaultRendererTaskOptions} & new (tasks : std.Array<listr2.listr2.ListrDefaultRendererTask>, options : listr2.listr2.ListrDefaultRendererOptions, events : listr2.listr2.ListrEventManager): listr2.listr2.DefaultRenderer>
}}}
to avoid circular code involving: 
- listr2.listr2.ListrDefaultRenderer
- listr2.listr2.ListrDefaultRendererTask
*/
@js.native
trait ListrDefaultRendererTask
  extends Task[
      Any, 
      TypeofDefaultRenderer & (Instantiable3[
        /* tasks */ js.Array[ListrDefaultRendererTask], 
        /* options */ ListrDefaultRendererOptions, 
        /* events */ ListrEventManager, 
        DefaultRenderer
      ])
    ]
