package typings.ionic

import typings.ionic.definitionsMod.AssociationType
import typings.ionic.definitionsMod.DistTag
import typings.ionic.definitionsMod.HookName
import typings.ionic.definitionsMod.HttpMethod
import typings.ionic.definitionsMod.InfoItemGroup
import typings.ionic.definitionsMod.IntegrationName
import typings.ionic.definitionsMod.KnownPlatform
import typings.ionic.definitionsMod.KnownResourceType
import typings.ionic.definitionsMod.NpmClient
import typings.ionic.definitionsMod.ProjectType
import typings.ionic.libProjectMod.ProjectDetailsErrorCode
import typings.ionic.npmMod.PkgManagerCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicStrings {
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HttpMethod
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait ERR_INVALID_PROJECT_FILE
    extends StObject
       with ProjectDetailsErrorCode
  inline def ERR_INVALID_PROJECT_FILE: ERR_INVALID_PROJECT_FILE = "ERR_INVALID_PROJECT_FILE".asInstanceOf[ERR_INVALID_PROJECT_FILE]
  
  @js.native
  sealed trait ERR_INVALID_PROJECT_TYPE
    extends StObject
       with ProjectDetailsErrorCode
  inline def ERR_INVALID_PROJECT_TYPE: ERR_INVALID_PROJECT_TYPE = "ERR_INVALID_PROJECT_TYPE".asInstanceOf[ERR_INVALID_PROJECT_TYPE]
  
  @js.native
  sealed trait ERR_MISSING_PROJECT_TYPE
    extends StObject
       with ProjectDetailsErrorCode
  inline def ERR_MISSING_PROJECT_TYPE: ERR_MISSING_PROJECT_TYPE = "ERR_MISSING_PROJECT_TYPE".asInstanceOf[ERR_MISSING_PROJECT_TYPE]
  
  @js.native
  sealed trait ERR_MULTI_MISSING_CONFIG
    extends StObject
       with ProjectDetailsErrorCode
  inline def ERR_MULTI_MISSING_CONFIG: ERR_MULTI_MISSING_CONFIG = "ERR_MULTI_MISSING_CONFIG".asInstanceOf[ERR_MULTI_MISSING_CONFIG]
  
  @js.native
  sealed trait ERR_MULTI_MISSING_ID
    extends StObject
       with ProjectDetailsErrorCode
  inline def ERR_MULTI_MISSING_ID: ERR_MULTI_MISSING_ID = "ERR_MULTI_MISSING_ID".asInstanceOf[ERR_MULTI_MISSING_ID]
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD
    extends StObject
       with HttpMethod
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with HttpMethod
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with HttpMethod
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends StObject
       with HttpMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PURGE
    extends StObject
       with HttpMethod
  inline def PURGE: PURGE = "PURGE".asInstanceOf[PURGE]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HttpMethod
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait android
    extends StObject
       with KnownPlatform
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait angular
    extends StObject
       with ProjectType
  inline def angular: angular = "angular".asInstanceOf[angular]
  
  @js.native
  sealed trait app extends StObject
  inline def app: app = "app".asInstanceOf[app]
  
  @js.native
  sealed trait bare
    extends StObject
       with ProjectType
  inline def bare: bare = "bare".asInstanceOf[bare]
  
  @js.native
  sealed trait bitbucket_cloud
    extends StObject
       with AssociationType
  inline def bitbucket_cloud: bitbucket_cloud = "bitbucket_cloud".asInstanceOf[bitbucket_cloud]
  
  @js.native
  sealed trait bitbucket_server
    extends StObject
       with AssociationType
  inline def bitbucket_server: bitbucket_server = "bitbucket_server".asInstanceOf[bitbucket_server]
  
  @js.native
  sealed trait browser
    extends StObject
       with KnownPlatform
  inline def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait buildColonafter
    extends StObject
       with HookName
  inline def buildColonafter: buildColonafter = "build:after".asInstanceOf[buildColonafter]
  
  @js.native
  sealed trait buildColonbefore
    extends StObject
       with HookName
  inline def buildColonbefore: buildColonbefore = "build:before".asInstanceOf[buildColonbefore]
  
  @js.native
  sealed trait canary
    extends StObject
       with DistTag
  inline def canary: canary = "canary".asInstanceOf[canary]
  
  @js.native
  sealed trait capacitor
    extends StObject
       with InfoItemGroup
       with IntegrationName
  inline def capacitor: capacitor = "capacitor".asInstanceOf[capacitor]
  
  @js.native
  sealed trait compile extends StObject
  inline def compile: compile = "compile".asInstanceOf[compile]
  
  @js.native
  sealed trait cordova
    extends StObject
       with InfoItemGroup
       with IntegrationName
  inline def cordova: cordova = "cordova".asInstanceOf[cordova]
  
  @js.native
  sealed trait custom
    extends StObject
       with ProjectType
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait dedupe
    extends StObject
       with PkgManagerCommand
  inline def dedupe: dedupe = "dedupe".asInstanceOf[dedupe]
  
  @js.native
  sealed trait development extends StObject
  inline def development: development = "development".asInstanceOf[development]
  
  @js.native
  sealed trait enterprise
    extends StObject
       with IntegrationName
  inline def enterprise: enterprise = "enterprise".asInstanceOf[enterprise]
  
  @js.native
  sealed trait environment
    extends StObject
       with InfoItemGroup
  inline def environment: environment = "environment".asInstanceOf[environment]
  
  @js.native
  sealed trait event extends StObject
  inline def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait github
    extends StObject
       with AssociationType
  inline def github: github = "github".asInstanceOf[github]
  
  @js.native
  sealed trait global extends StObject
  inline def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait icon
    extends StObject
       with KnownResourceType
  inline def icon: icon = "icon".asInstanceOf[icon]
  
  @js.native
  sealed trait info
    extends StObject
       with PkgManagerCommand
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait install
    extends StObject
       with PkgManagerCommand
  inline def install: install = "install".asInstanceOf[install]
  
  @js.native
  sealed trait ionic
    extends StObject
       with InfoItemGroup
  inline def ionic: ionic = "ionic".asInstanceOf[ionic]
  
  @js.native
  sealed trait `ionic-angular`
    extends StObject
       with ProjectType
  inline def `ionic-angular`: `ionic-angular` = "ionic-angular".asInstanceOf[`ionic-angular`]
  
  @js.native
  sealed trait ionic1
    extends StObject
       with ProjectType
  inline def ionic1: ionic1 = "ionic1".asInstanceOf[ionic1]
  
  @js.native
  sealed trait ios
    extends StObject
       with KnownPlatform
  inline def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait landscape extends StObject
  inline def landscape: landscape = "landscape".asInstanceOf[landscape]
  
  @js.native
  sealed trait latest
    extends StObject
       with DistTag
  inline def latest: latest = "latest".asInstanceOf[latest]
  
  @js.native
  sealed trait managed extends StObject
  inline def managed: managed = "managed".asInstanceOf[managed]
  
  @js.native
  sealed trait multiapp extends StObject
  inline def multiapp: multiapp = "multiapp".asInstanceOf[multiapp]
  
  @js.native
  sealed trait npm
    extends StObject
       with NpmClient
  inline def npm: npm = "npm".asInstanceOf[npm]
  
  @js.native
  sealed trait portrait extends StObject
  inline def portrait: portrait = "portrait".asInstanceOf[portrait]
  
  @js.native
  sealed trait production extends StObject
  inline def production: production = "production".asInstanceOf[production]
  
  @js.native
  sealed trait project extends StObject
  inline def project: project = "project".asInstanceOf[project]
  
  @js.native
  sealed trait react
    extends StObject
       with ProjectType
  inline def react: react = "react".asInstanceOf[react]
  
  @js.native
  sealed trait ready extends StObject
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait rebuild
    extends StObject
       with PkgManagerCommand
  inline def rebuild: rebuild = "rebuild".asInstanceOf[rebuild]
  
  @js.native
  sealed trait repo extends StObject
  inline def repo: repo = "repo".asInstanceOf[repo]
  
  @js.native
  sealed trait run
    extends StObject
       with PkgManagerCommand
  inline def run: run = "run".asInstanceOf[run]
  
  @js.native
  sealed trait serveColonafter
    extends StObject
       with HookName
  inline def serveColonafter: serveColonafter = "serve:after".asInstanceOf[serveColonafter]
  
  @js.native
  sealed trait serveColonbefore
    extends StObject
       with HookName
  inline def serveColonbefore: serveColonbefore = "serve:before".asInstanceOf[serveColonbefore]
  
  @js.native
  sealed trait serveColonready extends StObject
  inline def serveColonready: serveColonready = "serve:ready".asInstanceOf[serveColonready]
  
  @js.native
  sealed trait splash
    extends StObject
       with KnownResourceType
  inline def splash: splash = "splash".asInstanceOf[splash]
  
  @js.native
  sealed trait `ssl-commands` extends StObject
  inline def `ssl-commands`: `ssl-commands` = "ssl-commands".asInstanceOf[`ssl-commands`]
  
  @js.native
  sealed trait system
    extends StObject
       with InfoItemGroup
  inline def system: system = "system".asInstanceOf[system]
  
  @js.native
  sealed trait telemetry extends StObject
  inline def telemetry: telemetry = "telemetry".asInstanceOf[telemetry]
  
  @js.native
  sealed trait testing
    extends StObject
       with DistTag
  inline def testing: testing = "testing".asInstanceOf[testing]
  
  @js.native
  sealed trait uninstall
    extends StObject
       with PkgManagerCommand
  inline def uninstall: uninstall = "uninstall".asInstanceOf[uninstall]
  
  @js.native
  sealed trait unknown extends StObject
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait `update-check` extends StObject
  inline def `update-check`: `update-check` = "update-check".asInstanceOf[`update-check`]
  
  @js.native
  sealed trait utility
    extends StObject
       with InfoItemGroup
  inline def utility: utility = "utility".asInstanceOf[utility]
  
  @js.native
  sealed trait `viewport-fit-not-set` extends StObject
  inline def `viewport-fit-not-set`: `viewport-fit-not-set` = "viewport-fit-not-set".asInstanceOf[`viewport-fit-not-set`]
  
  @js.native
  sealed trait vue
    extends StObject
       with ProjectType
  inline def vue: vue = "vue".asInstanceOf[vue]
  
  @js.native
  sealed trait windows
    extends StObject
       with KnownPlatform
  inline def windows: windows = "windows".asInstanceOf[windows]
  
  @js.native
  sealed trait wp8
    extends StObject
       with KnownPlatform
  inline def wp8: wp8 = "wp8".asInstanceOf[wp8]
  
  @js.native
  sealed trait yarn
    extends StObject
       with NpmClient
  inline def yarn: yarn = "yarn".asInstanceOf[yarn]
}
