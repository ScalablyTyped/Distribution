package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable3
import typings.listr2.anon.Prompt
import typings.listr2.anon.TypeofDefaultRenderer
import typings.rxjs.mod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Default updating renderer for Listr2 */
@js.native
trait DefaultRenderer
  extends StObject
     with ListrRenderer {
  
  /* private */ var addSuffixToMessage: Any = js.native
  
  /* private */ var bottomBar: Any = js.native
  
  def createRender(): String = js.native
  def createRender(options: Prompt): String = js.native
  
  /* private */ var dumpData: Any = js.native
  
  /* private */ var formatString: Any = js.native
  
  @JSName("getSelfOrParentOption")
  def getSelfOrParentOption_rendererOptions[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof listr2.anon.TypeofDefaultRenderer & new (tasks : std.Array<listr2.listr2.Task<any, typeof DefaultRenderer>>, options : typeof DefaultRenderer['rendererOptions'], renderHook$ : rxjs.rxjs.Subject<void> | undefined): listr2.listr2.DefaultRenderer['rendererOptions'] */ js.Any */](
    task: Task[
      Any, 
      TypeofDefaultRenderer & (Instantiable3[
        /* tasks */ js.Array[
          Task[
            Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer */ js.Any
          ]
        ], 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer['rendererOptions'] */ /* options */ js.Any, 
        /* renderHook$ */ js.UndefOr[Subject[Unit]], 
        DefaultRenderer
      ])
    ],
    key: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: listr2.anon.TypeofDefaultRenderer & new (tasks : std.Array<listr2.listr2.Task<any, typeof DefaultRenderer>>, options : typeof DefaultRenderer['rendererOptions'], renderHook$ : rxjs.rxjs.Subject<void> | undefined): listr2.listr2.DefaultRenderer['rendererOptions'][T] */ js.Any = js.native
  
  /* private */ var getSymbol: Any = js.native
  
  @JSName("getTaskOptions")
  def getTaskOptions_rendererOptions(
    task: Task[
      Any, 
      TypeofDefaultRenderer & (Instantiable3[
        /* tasks */ js.Array[
          Task[
            Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer */ js.Any
          ]
        ], 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer['rendererOptions'] */ /* options */ js.Any, 
        /* renderHook$ */ js.UndefOr[Subject[Unit]], 
        DefaultRenderer
      ])
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: listr2.anon.TypeofDefaultRenderer & new (tasks : std.Array<listr2.listr2.Task<any, typeof DefaultRenderer>>, options : typeof DefaultRenderer['rendererOptions'], renderHook$ : rxjs.rxjs.Subject<void> | undefined): listr2.listr2.DefaultRenderer['rendererTaskOptions'] */ js.Any = js.native
  
  @JSName("getTaskTime")
  def getTaskTime_rendererOptions(
    task: Task[
      Any, 
      TypeofDefaultRenderer & (Instantiable3[
        /* tasks */ js.Array[
          Task[
            Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer */ js.Any
          ]
        ], 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer['rendererOptions'] */ /* options */ js.Any, 
        /* renderHook$ */ js.UndefOr[Subject[Unit]], 
        DefaultRenderer
      ])
    ]
  ): String = js.native
  
  @JSName("hasPersistentOutput")
  def hasPersistentOutput_rendererOptions(
    task: Task[
      Any, 
      TypeofDefaultRenderer & (Instantiable3[
        /* tasks */ js.Array[
          Task[
            Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer */ js.Any
          ]
        ], 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer['rendererOptions'] */ /* options */ js.Any, 
        /* renderHook$ */ js.UndefOr[Subject[Unit]], 
        DefaultRenderer
      ])
    ]
  ): Boolean = js.native
  
  @JSName("hasTimer")
  def hasTimer_rendererOptions(
    task: Task[
      Any, 
      TypeofDefaultRenderer & (Instantiable3[
        /* tasks */ js.Array[
          Task[
            Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer */ js.Any
          ]
        ], 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer['rendererOptions'] */ /* options */ js.Any, 
        /* renderHook$ */ js.UndefOr[Subject[Unit]], 
        DefaultRenderer
      ])
    ]
  ): Boolean = js.native
  
  /* private */ var id: Any = js.native
  
  /* private */ var indentMultilineOutput: Any = js.native
  
  @JSName("isBottomBar")
  def isBottomBar_rendererOptions(
    task: Task[
      Any, 
      TypeofDefaultRenderer & (Instantiable3[
        /* tasks */ js.Array[
          Task[
            Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer */ js.Any
          ]
        ], 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer['rendererOptions'] */ /* options */ js.Any, 
        /* renderHook$ */ js.UndefOr[Subject[Unit]], 
        DefaultRenderer
      ])
    ]
  ): Boolean = js.native
  
  /* private */ var multiLineRenderer: Any = js.native
  
  var options: /* import warning: importer.ImportType#apply Failed type conversion: listr2.anon.TypeofDefaultRenderer & new (tasks : std.Array<listr2.listr2.Task<any, typeof DefaultRenderer>>, options : typeof DefaultRenderer['rendererOptions'], renderHook$ : rxjs.rxjs.Subject<void> | undefined): listr2.listr2.DefaultRenderer['rendererOptions'] */ js.Any = js.native
  
  /* private */ var promptBar: Any = js.native
  
  /* private */ var renderBottomBar: Any = js.native
  
  @JSName("renderHook$")
  var renderHook$: js.UndefOr[Subject[Unit]] = js.native
  
  /* private */ var renderPrompt: Any = js.native
  
  /* private */ val spinner: Any = js.native
  
  /* private */ var spinnerPosition: Any = js.native
  
  var tasks: js.Array[
    Task[
      Any, 
      TypeofDefaultRenderer & (Instantiable3[
        /* tasks */ js.Array[
          Task[
            Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer */ js.Any
          ]
        ], 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DefaultRenderer['rendererOptions'] */ /* options */ js.Any, 
        /* renderHook$ */ js.UndefOr[Subject[Unit]], 
        DefaultRenderer
      ])
    ]
  ] = js.native
}
