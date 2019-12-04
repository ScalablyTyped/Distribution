organization := "org.scalablytyped"
name := "homeworks"
version := "1.0.50-2219f0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "8.2.14-4e53a5",
  "org.scalablytyped" %%% "angular__core" % "8.2.14-c10ed9",
  "org.scalablytyped" %%% "angular__forms" % "8.2.14-452cd6",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-a97355",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-72186b",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-33032f",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.3-99e1b6",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2d253b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-dc1a2d",
  "org.scalablytyped" %%% "typescript" % "3.7.2-cef6ee")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        