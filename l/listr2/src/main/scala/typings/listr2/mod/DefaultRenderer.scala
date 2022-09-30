package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable3
import typings.listr2.anon.Prompt
import typings.listr2.anon.TypeofDefaultRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Default updating renderer for Listr2 */
@js.native
trait DefaultRenderer extends ListrRenderer {
  
  /* private */ var addSuffixToMessage: Any = js.native
  
  /* private */ var bottomBar: Any = js.native
  
  def createRender(): String = js.native
  def createRender(options: Prompt): String = js.native
  
  /* private */ var dumpData: Any = js.native
  
  /* private */ var formatString: Any = js.native
  
  def getSelfOrParentOption[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof listr2.anon.TypeofDefaultRenderer & new (tasks : std.Array<listr2.listr2.Task<any, typeof DefaultRenderer>>, options : typeof DefaultRenderer['rendererOptions'], renderHook$ : listr2.listr2.Task<any, any>['renderHook$'] | undefined): listr2.listr2.DefaultRenderer['rendererOptions'] */ js.Any */](
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
        /* renderHook$ */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.Task<any, any>['renderHook$'] */ js.Any
        ], 
        DefaultRenderer
      ])
    ],
    key: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: listr2.anon.TypeofDefaultRenderer & new (tasks : std.Array<listr2.listr2.Task<any, typeof DefaultRenderer>>, options : typeof DefaultRenderer['rendererOptions'], renderHook$ : listr2.listr2.Task<any, any>['renderHook$'] | undefined): listr2.listr2.DefaultRenderer['rendererOptions'][T] */ js.Any = js.native
  
  /* private */ var getSymbol: Any = js.native
  
  def getTaskOptions(
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
        /* renderHook$ */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.Task<any, any>['renderHook$'] */ js.Any
        ], 
        DefaultRenderer
      ])
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: listr2.anon.TypeofDefaultRenderer & new (tasks : std.Array<listr2.listr2.Task<any, typeof DefaultRenderer>>, options : typeof DefaultRenderer['rendererOptions'], renderHook$ : listr2.listr2.Task<any, any>['renderHook$'] | undefined): listr2.listr2.DefaultRenderer['rendererTaskOptions'] */ js.Any = js.native
  
  def getTaskTime(
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
        /* renderHook$ */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.Task<any, any>['renderHook$'] */ js.Any
        ], 
        DefaultRenderer
      ])
    ]
  ): String = js.native
  
  def hasPersistentOutput(
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
        /* renderHook$ */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.Task<any, any>['renderHook$'] */ js.Any
        ], 
        DefaultRenderer
      ])
    ]
  ): Boolean = js.native
  
  def hasTimer(
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
        /* renderHook$ */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.Task<any, any>['renderHook$'] */ js.Any
        ], 
        DefaultRenderer
      ])
    ]
  ): Boolean = js.native
  
  /* private */ var id: Any = js.native
  
  /* private */ var indentMultilineOutput: Any = js.native
  
  def isBottomBar(
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
        /* renderHook$ */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.Task<any, any>['renderHook$'] */ js.Any
        ], 
        DefaultRenderer
      ])
    ]
  ): Boolean = js.native
  
  /* private */ var multiLineRenderer: Any = js.native
  
  var options: /* import warning: importer.ImportType#apply Failed type conversion: listr2.anon.TypeofDefaultRenderer & new (tasks : std.Array<listr2.listr2.Task<any, typeof DefaultRenderer>>, options : typeof DefaultRenderer['rendererOptions'], renderHook$ : listr2.listr2.Task<any, any>['renderHook$'] | undefined): listr2.listr2.DefaultRenderer['rendererOptions'] */ js.Any = js.native
  
  /* private */ var promptBar: Any = js.native
  
  /* private */ var renderBottomBar: Any = js.native
  
  @JSName("renderHook$")
  var renderHook$: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.Task<any, any>['renderHook$'] */ js.Any
  ] = js.native
  
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
        /* renderHook$ */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.Task<any, any>['renderHook$'] */ js.Any
        ], 
        DefaultRenderer
      ])
    ]
  ] = js.native
}
