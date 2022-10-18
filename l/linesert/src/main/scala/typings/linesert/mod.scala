package typings.linesert

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: Double): Any = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(path: PathLike): Any = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("linesert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def afterLine(lineIndex: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLine")(lineIndex.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def beforeLine(lineIndex: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLine")(lineIndex.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def insert(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def insert(
    content: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insert(content: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def insert(
    content: js.Array[String],
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
