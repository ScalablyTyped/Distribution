package typings
package ionicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ionicLibStrings {
  @js.native
  sealed trait DELETE
    extends ionicLib.definitionsMod.HttpMethod
  
  @js.native
  sealed trait ERR_INVALID_PROJECT_FILE
    extends ionicLib.libProjectMod.ProjectDetailsErrorCode
  
  @js.native
  sealed trait ERR_INVALID_PROJECT_TYPE
    extends ionicLib.libProjectMod.ProjectDetailsErrorCode
  
  @js.native
  sealed trait ERR_MISSING_PROJECT_TYPE
    extends ionicLib.libProjectMod.ProjectDetailsErrorCode
  
  @js.native
  sealed trait ERR_MULTI_MISSING_CONFIG
    extends ionicLib.libProjectMod.ProjectDetailsErrorCode
  
  @js.native
  sealed trait ERR_MULTI_MISSING_ID
    extends ionicLib.libProjectMod.ProjectDetailsErrorCode
  
  @js.native
  sealed trait GET
    extends ionicLib.definitionsMod.HttpMethod
  
  @js.native
  sealed trait HEAD
    extends ionicLib.definitionsMod.HttpMethod
  
  @js.native
  sealed trait OAuthIdentity extends js.Object
  
  @js.native
  sealed trait OPTIONS
    extends ionicLib.definitionsMod.HttpMethod
  
  @js.native
  sealed trait PATCH
    extends ionicLib.definitionsMod.HttpMethod
  
  @js.native
  sealed trait POST
    extends ionicLib.definitionsMod.HttpMethod
  
  @js.native
  sealed trait PURGE
    extends ionicLib.definitionsMod.HttpMethod
  
  @js.native
  sealed trait PUT
    extends ionicLib.definitionsMod.HttpMethod
  
  @js.native
  sealed trait android
    extends ionicLib.definitionsMod.KnownPlatform
  
  @js.native
  sealed trait angular
    extends ionicLib.definitionsMod.ProjectType
  
  @js.native
  sealed trait app extends js.Object
  
  @js.native
  sealed trait bare
    extends ionicLib.definitionsMod.ProjectType
  
  @js.native
  sealed trait bitbucket_cloud
    extends ionicLib.definitionsMod.AssociationType
  
  @js.native
  sealed trait bitbucket_server
    extends ionicLib.definitionsMod.AssociationType
  
  @js.native
  sealed trait browser
    extends ionicLib.definitionsMod.KnownPlatform
  
  @js.native
  sealed trait `build:after`
    extends ionicLib.definitionsMod.HookName
  
  @js.native
  sealed trait `build:before`
    extends ionicLib.definitionsMod.HookName
  
  @js.native
  sealed trait canary
    extends ionicLib.definitionsMod.DistTag
  
  @js.native
  sealed trait capacitor
    extends ionicLib.definitionsMod.InfoItemGroup
       with ionicLib.definitionsMod.IntegrationName
  
  @js.native
  sealed trait compile extends js.Object
  
  @js.native
  sealed trait cordova
    extends ionicLib.definitionsMod.InfoItemGroup
       with ionicLib.definitionsMod.IntegrationName
  
  @js.native
  sealed trait custom
    extends ionicLib.definitionsMod.ProjectType
  
  @js.native
  sealed trait development extends js.Object
  
  @js.native
  sealed trait environment
    extends ionicLib.definitionsMod.InfoItemGroup
  
  @js.native
  sealed trait github
    extends ionicLib.definitionsMod.AssociationType
  
  @js.native
  sealed trait global extends js.Object
  
  @js.native
  sealed trait guard extends js.Object
  
  @js.native
  sealed trait icon
    extends ionicLib.definitionsMod.KnownResourceType
  
  @js.native
  sealed trait ionic
    extends ionicLib.definitionsMod.InfoItemGroup
  
  @js.native
  sealed trait `ionic-angular`
    extends ionicLib.definitionsMod.ProjectType
  
  @js.native
  sealed trait ionic1
    extends ionicLib.definitionsMod.ProjectType
  
  @js.native
  sealed trait ios
    extends ionicLib.definitionsMod.KnownPlatform
  
  @js.native
  sealed trait landscape extends js.Object
  
  @js.native
  sealed trait latest
    extends ionicLib.definitionsMod.DistTag
  
  @js.native
  sealed trait max extends js.Object
  
  @js.native
  sealed trait multiapp extends js.Object
  
  @js.native
  sealed trait npm
    extends ionicLib.definitionsMod.NpmClient
  
  @js.native
  sealed trait portrait extends js.Object
  
  @js.native
  sealed trait production extends js.Object
  
  @js.native
  sealed trait project extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait reqgen extends js.Object
  
  @js.native
  sealed trait `serve:after`
    extends ionicLib.definitionsMod.HookName
  
  @js.native
  sealed trait `serve:before`
    extends ionicLib.definitionsMod.HookName
  
  @js.native
  sealed trait splash
    extends ionicLib.definitionsMod.KnownResourceType
  
  @js.native
  sealed trait `ssl-commands` extends js.Object
  
  @js.native
  sealed trait state extends js.Object
  
  @js.native
  sealed trait system
    extends ionicLib.definitionsMod.InfoItemGroup
  
  @js.native
  sealed trait telemetry extends js.Object
  
  @js.native
  sealed trait testing
    extends ionicLib.definitionsMod.DistTag
  
  @js.native
  sealed trait unknown extends js.Object
  
  @js.native
  sealed trait windows
    extends ionicLib.definitionsMod.KnownPlatform
  
  @js.native
  sealed trait wp8
    extends ionicLib.definitionsMod.KnownPlatform
  
  @js.native
  sealed trait yarn
    extends ionicLib.definitionsMod.NpmClient
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def ERR_INVALID_PROJECT_FILE: ERR_INVALID_PROJECT_FILE = "ERR_INVALID_PROJECT_FILE".asInstanceOf[ERR_INVALID_PROJECT_FILE]
  @scala.inline
  def ERR_INVALID_PROJECT_TYPE: ERR_INVALID_PROJECT_TYPE = "ERR_INVALID_PROJECT_TYPE".asInstanceOf[ERR_INVALID_PROJECT_TYPE]
  @scala.inline
  def ERR_MISSING_PROJECT_TYPE: ERR_MISSING_PROJECT_TYPE = "ERR_MISSING_PROJECT_TYPE".asInstanceOf[ERR_MISSING_PROJECT_TYPE]
  @scala.inline
  def ERR_MULTI_MISSING_CONFIG: ERR_MULTI_MISSING_CONFIG = "ERR_MULTI_MISSING_CONFIG".asInstanceOf[ERR_MULTI_MISSING_CONFIG]
  @scala.inline
  def ERR_MULTI_MISSING_ID: ERR_MULTI_MISSING_ID = "ERR_MULTI_MISSING_ID".asInstanceOf[ERR_MULTI_MISSING_ID]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  @scala.inline
  def OAuthIdentity: OAuthIdentity = "OAuthIdentity".asInstanceOf[OAuthIdentity]
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PURGE: PURGE = "PURGE".asInstanceOf[PURGE]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  @scala.inline
  def angular: angular = "angular".asInstanceOf[angular]
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  @scala.inline
  def bare: bare = "bare".asInstanceOf[bare]
  @scala.inline
  def bitbucket_cloud: bitbucket_cloud = "bitbucket_cloud".asInstanceOf[bitbucket_cloud]
  @scala.inline
  def bitbucket_server: bitbucket_server = "bitbucket_server".asInstanceOf[bitbucket_server]
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  @scala.inline
  def `build:after`: `build:after` = "build:after".asInstanceOf[`build:after`]
  @scala.inline
  def `build:before`: `build:before` = "build:before".asInstanceOf[`build:before`]
  @scala.inline
  def canary: canary = "canary".asInstanceOf[canary]
  @scala.inline
  def capacitor: capacitor = "capacitor".asInstanceOf[capacitor]
  @scala.inline
  def compile: compile = "compile".asInstanceOf[compile]
  @scala.inline
  def cordova: cordova = "cordova".asInstanceOf[cordova]
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  @scala.inline
  def development: development = "development".asInstanceOf[development]
  @scala.inline
  def environment: environment = "environment".asInstanceOf[environment]
  @scala.inline
  def github: github = "github".asInstanceOf[github]
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  @scala.inline
  def guard: guard = "guard".asInstanceOf[guard]
  @scala.inline
  def icon: icon = "icon".asInstanceOf[icon]
  @scala.inline
  def ionic: ionic = "ionic".asInstanceOf[ionic]
  @scala.inline
  def `ionic-angular`: `ionic-angular` = "ionic-angular".asInstanceOf[`ionic-angular`]
  @scala.inline
  def ionic1: ionic1 = "ionic1".asInstanceOf[ionic1]
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  @scala.inline
  def latest: latest = "latest".asInstanceOf[latest]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def multiapp: multiapp = "multiapp".asInstanceOf[multiapp]
  @scala.inline
  def npm: npm = "npm".asInstanceOf[npm]
  @scala.inline
  def portrait: portrait = "portrait".asInstanceOf[portrait]
  @scala.inline
  def production: production = "production".asInstanceOf[production]
  @scala.inline
  def project: project = "project".asInstanceOf[project]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def reqgen: reqgen = "reqgen".asInstanceOf[reqgen]
  @scala.inline
  def `serve:after`: `serve:after` = "serve:after".asInstanceOf[`serve:after`]
  @scala.inline
  def `serve:before`: `serve:before` = "serve:before".asInstanceOf[`serve:before`]
  @scala.inline
  def splash: splash = "splash".asInstanceOf[splash]
  @scala.inline
  def `ssl-commands`: `ssl-commands` = "ssl-commands".asInstanceOf[`ssl-commands`]
  @scala.inline
  def state: state = "state".asInstanceOf[state]
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  @scala.inline
  def telemetry: telemetry = "telemetry".asInstanceOf[telemetry]
  @scala.inline
  def testing: testing = "testing".asInstanceOf[testing]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
  @scala.inline
  def wp8: wp8 = "wp8".asInstanceOf[wp8]
  @scala.inline
  def yarn: yarn = "yarn".asInstanceOf[yarn]
}

