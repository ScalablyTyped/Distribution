organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-d9af56"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-8ffc9a",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-85716a",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-a4e51b",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-7c210b",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-3a154a",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-61099d",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-9fcdaf",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-07c6b5",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-22c77d",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-bb704c",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-f07e14",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-a901a1",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-7a8437",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-2dfa00",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-0fb854",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-0150fc",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-dcbdb8",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-99a80b",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-5a8c72",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-83a9a3",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-57b6e7",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-3ebe3d",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-256df2",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-ee2679",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-84fe3e",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        