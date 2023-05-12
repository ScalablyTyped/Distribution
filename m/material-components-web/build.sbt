organization := "org.scalablytyped"
name := "material-components-web"
version := "14.0.0-0a078b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__auto-init" % "14.0.0-62ddf4",
  "org.scalablytyped" %%% "material__banner" % "14.0.0-51c05f",
  "org.scalablytyped" %%% "material__base" % "14.0.0-d53a60",
  "org.scalablytyped" %%% "material__checkbox" % "14.0.0-73de34",
  "org.scalablytyped" %%% "material__chips" % "14.0.0-d7ac22",
  "org.scalablytyped" %%% "material__circular-progress" % "14.0.0-9d654c",
  "org.scalablytyped" %%% "material__data-table" % "14.0.0-b86dca",
  "org.scalablytyped" %%% "material__dialog" % "14.0.0-827953",
  "org.scalablytyped" %%% "material__dom" % "14.0.0-ee3655",
  "org.scalablytyped" %%% "material__drawer" % "14.0.0-1bf479",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-a8059f",
  "org.scalablytyped" %%% "material__form-field" % "14.0.0-212da4",
  "org.scalablytyped" %%% "material__icon-button" % "14.0.0-f73806",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-701d2f",
  "org.scalablytyped" %%% "material__linear-progress" % "14.0.0-be9e9c",
  "org.scalablytyped" %%% "material__list" % "14.0.0-02b5e5",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-ca0626",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-257109",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-635064",
  "org.scalablytyped" %%% "material__progress-indicator" % "14.0.0-90ecb7",
  "org.scalablytyped" %%% "material__radio" % "14.0.0-705d65",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-139341",
  "org.scalablytyped" %%% "material__segmented-button" % "14.0.0-8c8f9d",
  "org.scalablytyped" %%% "material__select" % "14.0.0-23416c",
  "org.scalablytyped" %%% "material__slider" % "14.0.0-582280",
  "org.scalablytyped" %%% "material__snackbar" % "14.0.0-01cf49",
  "org.scalablytyped" %%% "material__switch" % "14.0.0-119ff7",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-f4bae2",
  "org.scalablytyped" %%% "material__tab-bar" % "14.0.0-c85aab",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-c4097c",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-a1ff5a",
  "org.scalablytyped" %%% "material__textfield" % "14.0.0-0af994",
  "org.scalablytyped" %%% "material__tooltip" % "14.0.0-e91755",
  "org.scalablytyped" %%% "material__top-app-bar" % "14.0.0-72ba3d",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
