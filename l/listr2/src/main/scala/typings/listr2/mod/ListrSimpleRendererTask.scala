package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable2
import typings.listr2.anon.TypeofSimpleRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type ListrSimpleRendererTask = listr2.listr2.Task<any, {  nonTTY :boolean,   rendererOptions :listr2.listr2.ListrSimpleRendererOptions,   rendererTaskOptions :listr2.listr2.ListrSimpleRendererTaskOptions} & new (tasks : std.Array<listr2.listr2.ListrSimpleRendererTask>, options : listr2.listr2.ListrSimpleRendererOptions): listr2.listr2.SimpleRenderer>
}}}
to avoid circular code involving: 
- listr2.listr2.ListrSimpleRenderer
- listr2.listr2.ListrSimpleRendererTask
*/
@js.native
trait ListrSimpleRendererTask
  extends Task[
      Any, 
      TypeofSimpleRenderer & (Instantiable2[
        /* tasks */ js.Array[ListrSimpleRendererTask], 
        /* options */ ListrSimpleRendererOptions, 
        SimpleRenderer
      ])
    ]
