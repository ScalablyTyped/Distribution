package typings.iitc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractNianticParametersMod {
  
  object global {
    
    /**
      * as of 2014-08-14, Niantic have returned to minifying the javascript. This means we no longer get the nemesis object
      * and it's various member objects, functions, etc.
      * so we need to extract some essential parameters from the code for IITC to use
      */
    inline def extractFromStock(): Unit = js.Dynamic.global.applyDynamic("extractFromStock")().asInstanceOf[Unit]
  }
}
