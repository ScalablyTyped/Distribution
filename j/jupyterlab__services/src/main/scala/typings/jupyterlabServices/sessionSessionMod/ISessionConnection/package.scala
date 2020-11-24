package typings.jupyterlabServices.sessionSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ISessionConnection {
  
  /**
    * An arguments object for the kernel changed signal.
    */
  type IKernelChangedArgs = typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[
    typings.jupyterlabServices.kernelKernelMod.IKernelConnection | scala.Null, 
    typings.jupyterlabServices.kernelKernelMod.IKernelConnection | scala.Null, 
    typings.jupyterlabServices.jupyterlabServicesStrings.kernel
  ]
}
