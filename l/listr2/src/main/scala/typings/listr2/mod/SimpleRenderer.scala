package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable2
import typings.listr2.anon.TypeofSimpleRenderer
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the default renderer which is neither verbose or updating.
  * It provides short output like update renderer, but does not disturb
  * stdin during execution of listr tasks
  */
@js.native
trait SimpleRenderer
  extends StObject
     with ListrRenderer {
  
  /**
    * Event type renderer map contains functions to process different task events
    */
  var eventTypeRendererMap: Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in listr2.listr2.ListrEventType ]: (t : listr2.listr2.Task<any, {  nonTTY :boolean,   rendererOptions :{  prefixWithTimestamp :boolean | undefined,   output :'stdout' | 'stderr' | undefined}, readonly now (): std.Date, readonly formatTitle (): string, readonly formatTitle (task : listr2.listr2.Task<any, typeof SimpleRenderer>): string} & new (tasks : std.Array<listr2.listr2.Task<any, typeof SimpleRenderer>>, options : typeof SimpleRenderer['rendererOptions']): listr2.listr2.SimpleRenderer>, event : listr2.listr2.ListrEventFromType<P, listr2.listr2.ListrEvent>): void} */ js.Any
  ] = js.native
  
  def log(): Unit = js.native
  def log(output: String): Unit = js.native
  
  var options: /* import warning: importer.ImportType#apply Failed type conversion: listr2.anon.TypeofSimpleRenderer & new (tasks : std.Array<listr2.listr2.Task<any, typeof SimpleRenderer>>, options : typeof SimpleRenderer['rendererOptions']): listr2.listr2.SimpleRenderer['rendererOptions'] */ js.Any = js.native
  
  @JSName("render")
  def render_rendererOptions(
    tasks: js.Array[
      Task[
        Any, 
        TypeofSimpleRenderer & (Instantiable2[
          /* tasks */ js.Array[
            Task[
              Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SimpleRenderer */ js.Any
            ]
          ], 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SimpleRenderer['rendererOptions'] */ /* options */ js.Any, 
          SimpleRenderer
        ])
      ]
    ]
  ): Unit = js.native
  
  val tasks: js.Array[
    Task[
      Any, 
      TypeofSimpleRenderer & (Instantiable2[
        /* tasks */ js.Array[
          Task[
            Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SimpleRenderer */ js.Any
          ]
        ], 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SimpleRenderer['rendererOptions'] */ /* options */ js.Any, 
        SimpleRenderer
      ])
    ]
  ] = js.native
}
