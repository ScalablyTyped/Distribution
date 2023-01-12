package typings.hmscoreReactNativeHmsPush

import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushInts.`-1`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushInts.`1`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHmsPushProfileTypesMod {
  
  @js.native
  sealed trait ProfileTypeEnum extends StObject
  @JSImport("@hmscore/react-native-hms-push/src/HmsPushProfileTypes", "ProfileTypeEnum")
  @js.native
  object ProfileTypeEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ProfileTypeEnum & Double] = js.native
    
    @js.native
    sealed trait CUSTOM_PROFILE
      extends StObject
         with ProfileTypeEnum
    /* 2 */ val CUSTOM_PROFILE: typings.hmscoreReactNativeHmsPush.srcHmsPushProfileTypesMod.ProfileTypeEnum.CUSTOM_PROFILE & Double = js.native
    
    @js.native
    sealed trait HUAWEI_PROFILE
      extends StObject
         with ProfileTypeEnum
    /* 1 */ val HUAWEI_PROFILE: typings.hmscoreReactNativeHmsPush.srcHmsPushProfileTypesMod.ProfileTypeEnum.HUAWEI_PROFILE & Double = js.native
    
    @js.native
    sealed trait UNDEFINED_PROFILE
      extends StObject
         with ProfileTypeEnum
    /* -1 */ val UNDEFINED_PROFILE: typings.hmscoreReactNativeHmsPush.srcHmsPushProfileTypesMod.ProfileTypeEnum.UNDEFINED_PROFILE & Double = js.native
  }
  
  trait ProfileType extends StObject {
    
    var CUSTOM_PROFILE: `2`
    
    var HUAWEI_PROFILE: `1`
    
    var UNDEFINED_PROFILE: `-1`
  }
  object ProfileType {
    
    inline def apply(): ProfileType = {
      val __obj = js.Dynamic.literal(CUSTOM_PROFILE = 2, HUAWEI_PROFILE = 1, UNDEFINED_PROFILE = -1)
      __obj.asInstanceOf[ProfileType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProfileType] (val x: Self) extends AnyVal {
      
      inline def setCUSTOM_PROFILE(value: `2`): Self = StObject.set(x, "CUSTOM_PROFILE", value.asInstanceOf[js.Any])
      
      inline def setHUAWEI_PROFILE(value: `1`): Self = StObject.set(x, "HUAWEI_PROFILE", value.asInstanceOf[js.Any])
      
      inline def setUNDEFINED_PROFILE(value: `-1`): Self = StObject.set(x, "UNDEFINED_PROFILE", value.asInstanceOf[js.Any])
    }
  }
}
