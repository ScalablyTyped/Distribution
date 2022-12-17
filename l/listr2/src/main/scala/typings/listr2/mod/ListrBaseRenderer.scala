package typings.listr2.mod

import org.scalablytyped.runtime.Instantiable2
import typings.listr2.anon.TypeofListrBaseRenderer
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exported for javascript applications to extend the base renderer */
@JSImport("listr2", "ListrBaseRenderer")
@js.native
open class ListrBaseRenderer protected () extends ListrRenderer {
  def this(
    tasks: js.Array[
        Task[
          Any, 
          TypeofListrBaseRenderer & (Instantiable2[
            /* tasks */ js.Array[
              Task[
                Any, 
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ListrBaseRenderer */ js.Any
              ]
            ], 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ListrBaseRenderer.rendererOptions */ /* options */ js.Any, 
            ListrBaseRenderer
          ])
        ]
      ],
    options: Record[PropertyKey, Any]
  ) = this()
  
  var options: Record[PropertyKey, Any] = js.native
  
  var tasks: js.Array[
    Task[
      Any, 
      TypeofListrBaseRenderer & (Instantiable2[
        /* tasks */ js.Array[
          Task[
            Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ListrBaseRenderer */ js.Any
          ]
        ], 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ListrBaseRenderer.rendererOptions */ /* options */ js.Any, 
        ListrBaseRenderer
      ])
    ]
  ] = js.native
}
object ListrBaseRenderer {
  
  @JSImport("listr2", "ListrBaseRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("listr2", "ListrBaseRenderer.nonTTY")
  @js.native
  def nonTTY: Boolean = js.native
  inline def nonTTY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonTTY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("listr2", "ListrBaseRenderer.rendererOptions")
  @js.native
  def rendererOptions: Record[PropertyKey, Any] = js.native
  inline def rendererOptions_=(x: Record[PropertyKey, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererOptions")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("listr2", "ListrBaseRenderer.rendererTaskOptions")
  @js.native
  def rendererTaskOptions: Record[PropertyKey, Any] = js.native
  inline def rendererTaskOptions_=(x: Record[PropertyKey, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererTaskOptions")(x.asInstanceOf[js.Any])
}
