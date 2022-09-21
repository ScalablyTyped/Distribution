package typings.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppenderModule extends StObject {
  
  def configure(): AppenderFunction = js.native
  def configure(config: Unit, layouts: Unit, findAppender: js.Function0[AppenderFunction]): AppenderFunction = js.native
  def configure(config: Unit, layouts: Unit, findAppender: js.Function0[AppenderFunction], levels: Levels_): AppenderFunction = js.native
  def configure(config: Unit, layouts: Unit, findAppender: Unit, levels: Levels_): AppenderFunction = js.native
  def configure(config: Unit, layouts: LayoutsParam): AppenderFunction = js.native
  def configure(config: Unit, layouts: LayoutsParam, findAppender: js.Function0[AppenderFunction]): AppenderFunction = js.native
  def configure(config: Unit, layouts: LayoutsParam, findAppender: js.Function0[AppenderFunction], levels: Levels_): AppenderFunction = js.native
  def configure(config: Unit, layouts: LayoutsParam, findAppender: Unit, levels: Levels_): AppenderFunction = js.native
  def configure(config: Config): AppenderFunction = js.native
  def configure(config: Config, layouts: Unit, findAppender: js.Function0[AppenderFunction]): AppenderFunction = js.native
  def configure(config: Config, layouts: Unit, findAppender: js.Function0[AppenderFunction], levels: Levels_): AppenderFunction = js.native
  def configure(config: Config, layouts: Unit, findAppender: Unit, levels: Levels_): AppenderFunction = js.native
  def configure(config: Config, layouts: LayoutsParam): AppenderFunction = js.native
  def configure(config: Config, layouts: LayoutsParam, findAppender: js.Function0[AppenderFunction]): AppenderFunction = js.native
  def configure(
    config: Config,
    layouts: LayoutsParam,
    findAppender: js.Function0[AppenderFunction],
    levels: Levels_
  ): AppenderFunction = js.native
  def configure(config: Config, layouts: LayoutsParam, findAppender: Unit, levels: Levels_): AppenderFunction = js.native
}
