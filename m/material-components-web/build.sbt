organization := "org.scalablytyped"
name := "material-components-web"
version := "5.1.0-02e36f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20200515Z-5fa603",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20200515Z-64199d",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20200515Z-3b33f5",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20200515Z-9ee9ab",
  "org.scalablytyped" %%% "material__data-table" % "5.1.0-c39447",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20200515Z-c62081",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20200518Z-1f1434",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20200515Z-ccd4cd",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20200515Z-2e6cf5",
  "org.scalablytyped" %%% "material__icon-button" % "5.1.0-faab70",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20200515Z-82f09c",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20200515Z-3db3b7",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20200515Z-c08afb",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20200515Z-002f48",
  "org.scalablytyped" %%% "material__menu-surface" % "5.1.0-e45e9a",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20200515Z-b9babd",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20200515Z-c536f6",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20200515Z-71f2a2",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20200515Z-095038",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20200515Z-c45621",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20200515Z-620918",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20200515Z-f6559e",
  "org.scalablytyped" %%% "material__switch" % "5.1.0-eebfd7",
  "org.scalablytyped" %%% "material__tab" % "0.35-dt-20200515Z-1154eb",
  "org.scalablytyped" %%% "material__tab-bar" % "5.1.0-48bb52",
  "org.scalablytyped" %%% "material__tab-indicator" % "5.1.0-501f4d",
  "org.scalablytyped" %%% "material__tab-scroller" % "5.1.0-bebeda",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20200515Z-5b879a",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20200515Z-e1a32b",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
