package typings.mauron85ReactNativeBackgroundGeolocation

import typings.mauron85ReactNativeBackgroundGeolocation.mod.ActivityType
import typings.mauron85ReactNativeBackgroundGeolocation.mod.Event
import typings.mauron85ReactNativeBackgroundGeolocation.mod.HeadlessTaskEventName
import typings.mauron85ReactNativeBackgroundGeolocation.mod.LogLevel
import typings.mauron85ReactNativeBackgroundGeolocation.mod.NativeProvider
import typings.mauron85ReactNativeBackgroundGeolocation.mod.iOSActivityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mauron85ReactNativeBackgroundGeolocationStrings {
  
  @js.native
  sealed trait AutomotiveNavigation
    extends StObject
       with iOSActivityType
  inline def AutomotiveNavigation: AutomotiveNavigation = "AutomotiveNavigation".asInstanceOf[AutomotiveNavigation]
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with LogLevel
  inline def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with LogLevel
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait Fitness
    extends StObject
       with iOSActivityType
  inline def Fitness: Fitness = "Fitness".asInstanceOf[Fitness]
  
  @js.native
  sealed trait INFO
    extends StObject
       with LogLevel
  inline def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait IN_VEHICLE
    extends StObject
       with ActivityType
  inline def IN_VEHICLE: IN_VEHICLE = "IN_VEHICLE".asInstanceOf[IN_VEHICLE]
  
  @js.native
  sealed trait ON_BICYCLE
    extends StObject
       with ActivityType
  inline def ON_BICYCLE: ON_BICYCLE = "ON_BICYCLE".asInstanceOf[ON_BICYCLE]
  
  @js.native
  sealed trait ON_FOOT
    extends StObject
       with ActivityType
  inline def ON_FOOT: ON_FOOT = "ON_FOOT".asInstanceOf[ON_FOOT]
  
  @js.native
  sealed trait Other
    extends StObject
       with iOSActivityType
  inline def Other: Other = "Other".asInstanceOf[Other]
  
  @js.native
  sealed trait OtherNavigation
    extends StObject
       with iOSActivityType
  inline def OtherNavigation: OtherNavigation = "OtherNavigation".asInstanceOf[OtherNavigation]
  
  @js.native
  sealed trait RUNNING
    extends StObject
       with ActivityType
  inline def RUNNING: RUNNING = "RUNNING".asInstanceOf[RUNNING]
  
  @js.native
  sealed trait STILL
    extends StObject
       with ActivityType
  inline def STILL: STILL = "STILL".asInstanceOf[STILL]
  
  @js.native
  sealed trait TILTING
    extends StObject
       with ActivityType
  inline def TILTING: TILTING = "TILTING".asInstanceOf[TILTING]
  
  @js.native
  sealed trait TRACE
    extends StObject
       with LogLevel
  inline def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with ActivityType
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait WALKING
    extends StObject
       with ActivityType
  inline def WALKING: WALKING = "WALKING".asInstanceOf[WALKING]
  
  @js.native
  sealed trait WARN
    extends StObject
       with LogLevel
  inline def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @js.native
  sealed trait abort_requested
    extends StObject
       with Event
  inline def abort_requested: abort_requested = "abort_requested".asInstanceOf[abort_requested]
  
  @js.native
  sealed trait activity
    extends StObject
       with Event
       with HeadlessTaskEventName
  inline def activity: activity = "activity".asInstanceOf[activity]
  
  @js.native
  sealed trait authorization
    extends StObject
       with Event
  inline def authorization: authorization = "authorization".asInstanceOf[authorization]
  
  @js.native
  sealed trait background
    extends StObject
       with Event
  inline def background: background = "background".asInstanceOf[background]
  
  @js.native
  sealed trait error_
    extends StObject
       with Event
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait foreground
    extends StObject
       with Event
  inline def foreground: foreground = "foreground".asInstanceOf[foreground]
  
  @js.native
  sealed trait fused
    extends StObject
       with NativeProvider
  inline def fused: fused = "fused".asInstanceOf[fused]
  
  @js.native
  sealed trait gps
    extends StObject
       with NativeProvider
  inline def gps: gps = "gps".asInstanceOf[gps]
  
  @js.native
  sealed trait http_authorization
    extends StObject
       with Event
  inline def http_authorization: http_authorization = "http_authorization".asInstanceOf[http_authorization]
  
  @js.native
  sealed trait location
    extends StObject
       with Event
       with HeadlessTaskEventName
  inline def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait network
    extends StObject
       with NativeProvider
  inline def network: network = "network".asInstanceOf[network]
  
  @js.native
  sealed trait passive
    extends StObject
       with NativeProvider
  inline def passive: passive = "passive".asInstanceOf[passive]
  
  @js.native
  sealed trait start
    extends StObject
       with Event
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stationary
    extends StObject
       with Event
       with HeadlessTaskEventName
  inline def stationary: stationary = "stationary".asInstanceOf[stationary]
  
  @js.native
  sealed trait stop
    extends StObject
       with Event
  inline def stop: stop = "stop".asInstanceOf[stop]
}
