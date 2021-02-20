organization := "org.scalablytyped"
name := "material-components-web"
version := "8.0.0-6f6601"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "material__auto-init" % "8.0.0-921ea6",
  "org.scalablytyped" %%% "material__banner" % "8.0.0-359810",
  "org.scalablytyped" %%% "material__base" % "8.0.0-b5bf49",
  "org.scalablytyped" %%% "material__checkbox" % "8.0.0-ae8fe1",
  "org.scalablytyped" %%% "material__chips" % "8.0.0-ad6354",
  "org.scalablytyped" %%% "material__circular-progress" % "8.0.0-c8f558",
  "org.scalablytyped" %%% "material__data-table" % "8.0.0-225cc6",
  "org.scalablytyped" %%% "material__dialog" % "8.0.0-b64547",
  "org.scalablytyped" %%% "material__dom" % "8.0.0-be4d70",
  "org.scalablytyped" %%% "material__drawer" % "8.0.0-846499",
  "org.scalablytyped" %%% "material__floating-label" % "8.0.0-9a90bf",
  "org.scalablytyped" %%% "material__form-field" % "8.0.0-f9089d",
  "org.scalablytyped" %%% "material__icon-button" % "8.0.0-2e04e7",
  "org.scalablytyped" %%% "material__line-ripple" % "8.0.0-d3936e",
  "org.scalablytyped" %%% "material__linear-progress" % "8.0.0-3c8b5d",
  "org.scalablytyped" %%% "material__list" % "8.0.0-903562",
  "org.scalablytyped" %%% "material__menu" % "8.0.0-e8d691",
  "org.scalablytyped" %%% "material__menu-surface" % "8.0.0-37119b",
  "org.scalablytyped" %%% "material__notched-outline" % "8.0.0-49229b",
  "org.scalablytyped" %%% "material__progress-indicator" % "8.0.0-5638b5",
  "org.scalablytyped" %%% "material__radio" % "8.0.0-d5def6",
  "org.scalablytyped" %%% "material__ripple" % "8.0.0-7e35fe",
  "org.scalablytyped" %%% "material__segmented-button" % "8.0.0-cf42a7",
  "org.scalablytyped" %%% "material__select" % "8.0.0-ad5a7f",
  "org.scalablytyped" %%% "material__slider" % "8.0.0-df70c3",
  "org.scalablytyped" %%% "material__snackbar" % "8.0.0-ab5da9",
  "org.scalablytyped" %%% "material__switch" % "8.0.0-10d3b3",
  "org.scalablytyped" %%% "material__tab" % "8.0.0-79871a",
  "org.scalablytyped" %%% "material__tab-bar" % "8.0.0-4606f7",
  "org.scalablytyped" %%% "material__tab-indicator" % "8.0.0-658a59",
  "org.scalablytyped" %%% "material__tab-scroller" % "8.0.0-31b2b6",
  "org.scalablytyped" %%% "material__textfield" % "8.0.0-ecdc99",
  "org.scalablytyped" %%% "material__tooltip" % "8.0.0-844b02",
  "org.scalablytyped" %%% "material__top-app-bar" % "8.0.0-948a75",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
