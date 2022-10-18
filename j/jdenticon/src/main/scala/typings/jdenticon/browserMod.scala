package typings.jdenticon

import typings.jdenticon.mod.JdenticonCompatibleCanvasRenderingContext2D
import typings.jdenticon.mod.JdenticonConfig
import typings.node.bufferMod.global.Buffer
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object browserMod {
  
  @JSImport("jdenticon/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configure(): JdenticonConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[JdenticonConfig]
  inline def configure(newConfig: JdenticonConfig): JdenticonConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(newConfig.asInstanceOf[js.Any]).asInstanceOf[JdenticonConfig]
  
  inline def drawIcon(ctx: JdenticonCompatibleCanvasRenderingContext2D, hashOrValue: Any, size: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawIcon")(ctx.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawIcon(ctx: JdenticonCompatibleCanvasRenderingContext2D, hashOrValue: Any, size: Double, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawIcon")(ctx.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawIcon(
    ctx: JdenticonCompatibleCanvasRenderingContext2D,
    hashOrValue: Any,
    size: Double,
    config: JdenticonConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawIcon")(ctx.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toPng(hashOrValue: Any, size: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("toPng")(hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def toPng(hashOrValue: Any, size: Double, config: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("toPng")(hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def toPng(hashOrValue: Any, size: Double, config: JdenticonConfig): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("toPng")(hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def toSvg(hashOrValue: Any, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSvg")(hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toSvg(hashOrValue: Any, size: Double, config: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSvg")(hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toSvg(hashOrValue: Any, size: Double, config: JdenticonConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSvg")(hashOrValue.asInstanceOf[js.Any], size.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def update(elementOrSelector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def update(elementOrSelector: String, hashOrValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(elementOrSelector: String, hashOrValue: Any, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(elementOrSelector: String, hashOrValue: Any, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(elementOrSelector: String, hashOrValue: Unit, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(elementOrSelector: String, hashOrValue: Unit, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(elementOrSelector: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def update(elementOrSelector: Element, hashOrValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(elementOrSelector: Element, hashOrValue: Any, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(elementOrSelector: Element, hashOrValue: Any, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(elementOrSelector: Element, hashOrValue: Unit, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(elementOrSelector: Element, hashOrValue: Unit, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateCanvas(elementOrSelector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def updateCanvas(elementOrSelector: String, hashOrValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCanvas(elementOrSelector: String, hashOrValue: Any, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCanvas(elementOrSelector: String, hashOrValue: Any, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCanvas(elementOrSelector: String, hashOrValue: Unit, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCanvas(elementOrSelector: String, hashOrValue: Unit, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCanvas(elementOrSelector: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def updateCanvas(elementOrSelector: Element, hashOrValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCanvas(elementOrSelector: Element, hashOrValue: Any, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCanvas(elementOrSelector: Element, hashOrValue: Any, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCanvas(elementOrSelector: Element, hashOrValue: Unit, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateCanvas(elementOrSelector: Element, hashOrValue: Unit, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCanvas")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateSvg(elementOrSelector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def updateSvg(elementOrSelector: String, hashOrValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateSvg(elementOrSelector: String, hashOrValue: Any, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateSvg(elementOrSelector: String, hashOrValue: Any, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateSvg(elementOrSelector: String, hashOrValue: Unit, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateSvg(elementOrSelector: String, hashOrValue: Unit, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateSvg(elementOrSelector: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def updateSvg(elementOrSelector: Element, hashOrValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateSvg(elementOrSelector: Element, hashOrValue: Any, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateSvg(elementOrSelector: Element, hashOrValue: Any, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateSvg(elementOrSelector: Element, hashOrValue: Unit, config: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateSvg(elementOrSelector: Element, hashOrValue: Unit, config: JdenticonConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSvg")(elementOrSelector.asInstanceOf[js.Any], hashOrValue.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("jdenticon/browser", "version")
  @js.native
  val version: String = js.native
}
