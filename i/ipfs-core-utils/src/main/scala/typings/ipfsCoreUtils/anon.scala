package typings.ipfsCoreUtils

import typings.cids.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base extends StObject {
    
    var base: js.UndefOr[String] = js.undefined
    
    var upgrade: js.UndefOr[Boolean] = js.undefined
  }
  object Base {
    
    @scala.inline
    def apply(): Base = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
    }
  }
  
  trait Cid extends StObject {
    
    var cid: ^
    
    var path: js.UndefOr[String] = js.undefined
  }
  object Cid {
    
    @scala.inline
    def apply(cid: ^): Cid = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cid]
    }
    
    @scala.inline
    implicit class CidMutableBuilder[Self <: Cid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCid(value: ^): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
