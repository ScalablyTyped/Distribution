package typings.killPort

import typings.killPort.killPortStrings.tcp
import typings.killPort.killPortStrings.udp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Kill the process running on given port.
    *
    * @param port Port where the process is running.
    * @param protocol Protocol for the port.
    *
    * @example
    * import kill = require('kill-port')
    * import * as http from 'http';
    * const port = 8080
    *
    * const server = http.createServer((req, res) => {
    *   res.writeHead(200, {
    *     'Content-Type': 'text/plain'
    *   })
    *
    *   res.end('Hi!')
    * })
    *
    * server.listen(port, () => {
    *   setTimeout(() => {
    *     // Currently you can kill ports running on TCP or UDP protocols
    *     kill(port, 'tcp')
    *       .then(console.log)
    *       .catch(console.log)
    *   }, 1000)
    * })
    */
  inline def apply(port: Double): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SuccessfulExec */ Any
  ] = ^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SuccessfulExec */ Any
  ]]
  inline def apply(port: Double, /** @default 'tcp' */
  protocol: tcp | udp): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SuccessfulExec */ Any
  ] = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SuccessfulExec */ Any
  ]]
  
  @JSImport("kill-port", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
