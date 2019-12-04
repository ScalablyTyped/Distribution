package typings.javascriptDashObfuscator

import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.javascriptDashObfuscator.srcTypesOptionsTInputOptionsMod.TInputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/interfaces/container/IInversifyContainerFacade", JSImport.Namespace)
@js.native
object srcInterfacesContainerIInversifyContainerFacadeMod extends js.Object {
  @js.native
  trait IInversifyContainerFacade extends js.Object {
    /**
      * @param serviceIdentifier
      */
    def get[T](serviceIdentifier: ServiceIdentifier[T]): T = js.native
    /**
      * @param serviceIdentifier
      * @param named
      */
    def getNamed[T](serviceIdentifier: ServiceIdentifier[T], named: String): T = js.native
    def getNamed[T](serviceIdentifier: ServiceIdentifier[T], named: js.Symbol): T = js.native
    def getNamed[T](serviceIdentifier: ServiceIdentifier[T], named: Double): T = js.native
    /**
      * @param {string} sourceCode
      * @param {string} sourceMap
      * @param {TInputOptions} options
      */
    def load(sourceCode: String, sourceMap: String, options: TInputOptions): Unit = js.native
    def unload(): Unit = js.native
  }
  
}

